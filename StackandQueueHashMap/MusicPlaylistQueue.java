package StackandQueueHashMap;

public class MusicPlaylistQueue {
    class MusicPlayList{
        String song;
        MusicPlayList prev;
        MusicPlayList next;
        public MusicPlayList (String song){
            this.song = song;
        }

        MusicPlayList front, rear;

        boolean isEmoty(){
            return front==null;
        }

        void addFront(String data){
            MusicPlayList newSong = new MusicPlayList(data);
            if(front== null){
                front=rear=newSong;
            }else{
                newSong.next = front;
                front.prev = newSong;
                front = newSong;
            }
        }

        void addrear(String data){
            MusicPlayList newSong = new MusicPlayList(data);
            if(front == null){
                front = rear = newSong;
            }else{
                rear.next = newSong;
                newSong.prev = rear;
                rear = newSong;
            }
        }

        void removeFront(){
            if(front ==null){
                System.out.println("Their is no song");
                
            }else{
                front = front.next; 
            }
        }
    }

}
