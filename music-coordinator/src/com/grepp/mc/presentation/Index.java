package com.grepp.mc.presentation;

import com.grepp.mc.domain.coordinator.MusicCoordinator;
import com.grepp.mc.domain.song.Song;
import java.util.Scanner;

public class Index {

    public void index(){
        Scanner sc = new Scanner(System.in);
        while(true) {

            System.out.println("\n================================\n");
            System.out.println("오늘 어떄요? 오늘에 어울리는 노래를 추천해드려요! (종료: exit)");
            System.out.print("입력 : ");
            String input = sc.nextLine();

            if (input.equals("exit")) break;

            MusicCoordinator coordinator = new MusicCoordinator();
            Song song = coordinator.recommend(input);

            if (song == null){
                System.out.println("서버에 문제가 생겼어요!");
                continue;
            }

            System.out.println("\n======= AI 답변 =======\n");
            System.out.println("추천하는 곡은 " + song.title() + " 입니다.");
            System.out.println(song.reason());
            System.out.println("생성된 QR 코드를 통해 음악을 감상하세요!");

        }
    }

}
