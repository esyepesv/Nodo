import { Component, OnInit } from '@angular/core';
import { MessageService } from '../message.service';

@Component({
  selector: 'app-messages',
  templateUrl: './messages.component.html',
  styleUrls: ['./messages.component.Scss']
})
export class MessagesComponent implements OnInit {

  constructor(public messageService: MessageService) {}

  ngOnInit() {
  }

}
