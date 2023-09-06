package ru.sergsnic.springcourse.Task8;

public class ClassicalMusic implements Music {
    private ClassicalMusic(){}
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    public void doMyInit(){
        System.out.println("Инициализация бина");
    }
    public void doMyDestroy(){
        System.out.println("уничтожение бина");
    }
        @Override
    public String getSong() {
        return "Vivaldi - Seasons autumn";
    }
}
