package com.nseit.SpringExercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringExerciseApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=
                new AnnotationConfigApplicationContext(SpringExerciseApplication.class);
        BinarySearchImp binarySearchImp=applicationContext.getBean(BinarySearchImp.class);
        int result = binarySearchImp.binarySearch(new int[]{11,33,3,4,6},33);
        System.out.println(result);
    }

}
