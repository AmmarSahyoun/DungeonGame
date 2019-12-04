package com.company;

    public abstract class Item{
        private int score ;

        public Item(int score) {
            this.score = score;
        }

        public float getScore(){
            return score;
        }
        public abstract void showDescription();
    }