package GameOfLife;

import java.util.ArrayList;

public class Cell {
    ArrayList<Cell> near; //хранит колтчество ячеек рядом с клеткой
    Status status;

    public Cell(){
        status = Status.NONE;
        near = new ArrayList<>();
    }
    /*
    добавляет всех соседей ячейки в список
     */
    void addNear(Cell cell){
        near.add(cell);
    }

    void step1() {
        int around = countNearCells();
        status = status.step1(around);
    }

    void step2(){
        status = status.step2();
    }


 /*
 считает сколько ячеек рядом
  */
    int countNearCells() {
        int count = 0;
        for (Cell cel : near) {
            if (cel.status.isCell())
                count++;
        }
        return count;
    }
/*
переворачивает восемь клеток вокруг точки по которой кликнули мышкой т.е. неживые клетки становятся живыми
 */
    void turn(){
       for(Cell cell:  near)
           cell.status = cell.status.isCell() ? Status.NONE: Status.LIVE;
    }

}
