class Scrabble {

    int score = 0;
    Scrabble(String word) {

        if(word.isEmpty()) return;
        String[] wordkArr = word.toUpperCase().split("");
        for(String w:wordkArr){
            if("A, E, I, O, U, L, N, R, S, T".contains(w)){
                score += 1;
            }else if("D, G".contains(w)){
                score += 2;
            }else if("B, C, M, P".contains(w)){
                score += 3;
            }else if("F, H, V, W, Y".contains(w)){
                score += 4;
            }else if("K".contains(w)){
                score += 5;
            }else if("J, X".contains(w)){
                score += 8;
            }else if("Q, Z".contains(w)){
                score += 10;
            }
        }
    }

    int getScore() {
        return score;
    }

}
