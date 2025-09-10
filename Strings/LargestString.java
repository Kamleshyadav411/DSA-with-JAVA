import java.util.*;


class LargestString{
    public static void main(String args[]){
        String fruits[] = {"apple","mango","banana"};

        String largest = fruits[0];

        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){  // yaha hamara largest fruits[i] se chota ho gya 
                largest = fruits[i]; // tab yaha largest mein assign kar denge fruits[i] ko
            }
        }
        System.out.println(largest);
    }
}



//TC... hai eska o(x*n)  yaha pe x har words and n length hai 