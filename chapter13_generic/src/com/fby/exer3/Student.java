package com.fby.exer3;

import java.util.Objects;

/**
 * ClassName: Student
 * Package: com.fby.exer3
 * Description:
 *
 * @Author: 王珏, James wang
 * @Create: 2024/3/22 - 10:45
 * @Version: V0.1
 */
public class Student<T> {
    private String name;
    private T score;

    public Student() {
    }

    public Student(String name, T score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getScore() {
        return score;
    }

    public void setScore(T score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student<?> student = (Student<?>) o;
        return Objects.equals(name, student.name) && Objects.equals(score, student.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }
}
