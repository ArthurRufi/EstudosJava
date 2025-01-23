package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {2, 7, 11, 15};
        int target= 9;

        int[] resultado = solution.twoSum(nums, target);


        System.out.println("Indeces: ["+resultado[0] +", "+ resultado[1] +"]");
        }
    }
