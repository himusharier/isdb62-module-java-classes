package PracticeProjects.CodingWithSajal.MethodChaining;

public class Calculator {
    int value ;

    public Calculator(){
        this.value = 0;
    }

    Calculator add(int val2){
        this.value += val2;
        return this;
    }
    Calculator sub(int val2){
        this.value -= val2;
        return this;
    }
    Calculator mul(int val2){
        this.value *= val2;
        return this;
    }

    Calculator output(){
        System.out.println(this.value);
        return this;
    }


}
