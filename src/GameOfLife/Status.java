package GameOfLife;

public enum Status {
    NONE,  //первый шаг в клетке ничего нет
    BORN, // в клетке должна жизнь родиться
    LIVE, // первый шаг в клетке жизнь
    DIED; // в клетке должна жизнь умереть

    /*
    первый шаг проверяет сколько клеток с жизнью вокруг клетки
    обновляет статус клетки
     */
    public Status step1 (int around)
    {
        switch (this) {
            case NONE:
                return (around == 3) ? BORN : NONE; //живет если вокруг 3 жизни
            case LIVE:
                return (around <= 1 || around >= 4) ? DIED : LIVE; // умирает если вокруг меньше 1 или больше 4 жизней
            default:
                return this;
        }
    }

    /*
    второй шаг меняем статусы клеток
     */
    public Status step2 ()
    {
        switch (this)
        {
            case BORN:
                return LIVE; // жизнь рождается
            case DIED:
                return NONE; // жизнь умирает ,клектка становится пустой
            default:
                return this;
        }
    }

    /*
    метод сообзает есть ли в ячейке жизнь
     */
    public boolean isCell(){
        return this == LIVE || this == DIED;
    }

}
