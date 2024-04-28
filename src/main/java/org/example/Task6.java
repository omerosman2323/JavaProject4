package org.example;

public class Task6 {
    public static void main(String[] args) {
        String countVowels= (String str){

            String vowels = "aeiouAEIOU";

            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (vowels.indexOf(str.charAt(i)) != -1) {
                    count++;
                }
            }

            return count;
        }

        public static void main (String[]args){
            String str = "documentation";
            System.out.println("Number of vowels: " + countVowels(str));
        }
    }
}