package sorting;


public class bubbleSort{
    public static void main(String[] args) {
        int [] st = {76,90,87,57,93};
        for(int i = 0;i<st.length;i++){
            for(int j = i+1;j<st.length;j++){
                if(st[j] < st[i]){
                    int temp = st[j];
                    st[j] = st[i];
                    st[i] = temp;
                }
            }
        }
        for(int i: st){
            System.out.print(i + " ");
        }
    }    
}