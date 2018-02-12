import { Component, OnInit } from '@angular/core';
import { AnnouncementService } from "../../services/announcement.service";
import { formatDate } from "ngx-bootstrap/bs-moment/format";
import { MatDialog } from "@angular/material";
import { CreateAnnouncementComponent } from "./create-announcement.component";

@Component({
  selector: 'app-announcement',
  templateUrl: './announcement.component.html',
  styleUrls: ['./announcement.component.css']
})
export class AnnouncementComponent implements OnInit {
  data:Array<any> = [];
  rows:Array<any> = [];

  columns:Array<any> = [
    {title: 'Start Date', name: 'startdate'},
    {title: 'End Date', name: 'enddate'},
    {title: 'Message', name: 'message'}
  ];

  page:number = 1;
  itemsPerPage:number = 10;
  maxSize:number = 5;
  numPages:number = 1;
  length:number = 0;

  config:any = {
    paging: true,
    sorting: {columns: this.columns},
    filtering: {filterString: ''},
    className: ['table-bordered']
  };

  constructor(
    private announcementService : AnnouncementService
  ) {}

  ngOnInit():void {
    this.getTableData();
  }

  getTableData():any {
    this.announcementService.getList()
      .subscribe(data => {
          for (let entry of data) {
            entry.startdate = formatDate(new Date(entry.startdate), 'MM/DD/YY hh:mm A');
            entry.enddate = formatDate(new Date(entry.enddate), 'MM/DD/YY hh:mm A');
            this.data.push(entry);
          }
          //this.data = data;
          this.onChangeTable(this.config);
        }
      );
  }

  changePage(page:any, data:Array<any> = this.data):Array<any> {
    let start = (page.page - 1) * page.itemsPerPage;
    let end = page.itemsPerPage > -1 ? (start + page.itemsPerPage) : data.length;
    return data.slice(start, end);
  }

  changeSort(data:any, config:any):any {
    if (!config.sorting) {
      return data;
    }

    let columns = this.config.sorting.columns || [];
    let columnName:string = void 0;
    let sort:string = void 0;

    for (let i = 0; i < columns.length; i++) {
      if (columns[i].sort !== '' && columns[i].sort !== false) {
        columnName = columns[i].name;
        sort = columns[i].sort;
      }
    }

    if (!columnName) {
      return data;
    }

    // simple sorting
    return data.sort((previous:any, current:any) => {
      if (previous[columnName] > current[columnName]) {
        return sort === 'desc' ? -1 : 1;
      } else if (previous[columnName] < current[columnName]) {
        return sort === 'asc' ? -1 : 1;
      }
      return 0;
    });
  }


  public changeFilter(data:any, config:any):any {
    let filteredData:Array<any> = data;
    this.columns.forEach((column:any) => {
      if (column.filtering) {
        filteredData = filteredData.filter((item:any) => {
          return item[column.name].match(column.filtering.filterString);
        });
      }
    });

    if (!config.filtering) {
      return filteredData;
    }

    if (config.filtering.columnName) {
      return filteredData.filter((item:any) =>
        item[config.filtering.columnName].match(this.config.filtering.filterString));
    }

    let tempArray:Array<any> = [];
    filteredData.forEach((item:any) => {
      let flag = false;
      this.columns.forEach((column:any) => {
        if (item[column.name].toString().match(this.config.filtering.filterString)) {
          flag = true;
        }
      });
      if (flag) {
        tempArray.push(item);
      }
    });
    filteredData = tempArray;

    return filteredData;
  }

  public onChangeTable(config:any, page:any = {page: this.page, itemsPerPage: this.itemsPerPage}):any {
    if (config.filtering) {
      Object.assign(this.config.filtering, config.filtering);
    }

    if (config.sorting) {
      Object.assign(this.config.sorting, config.sorting);
    }

    let filteredData = this.changeFilter(this.data, this.config);
    let sortedData = this.changeSort(filteredData, this.config);
    this.rows = page && config.paging ? this.changePage(page, sortedData) : sortedData;
    this.length = this.data.length;
  }

  public onCellClick(data: any): any {
    console.log(data);
  }

}

