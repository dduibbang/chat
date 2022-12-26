package com.sample.stomp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {
    public enum MessageType {
        ENTER, TALK    //채팅방의 두 상황 : 채팅방 입장, 대화하기
    }

    private MessageType type; //메세지타입

    private String roomId;//채팅방 ID

    private String sender; //보내는 사람

    private String message;//내용
}
