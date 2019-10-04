package exam;
import java.util.ArrayList;

import java.util.Arrays;

import java.util.LinkedHashSet;

import java.util.Scanner;

import java.util.Stack;



public class exam {



	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);

		int flag=0;

		int n = Integer.parseInt(scan.nextLine());

		ArrayList<String> list = new ArrayList<String>();

		String arr[] = new String[n]; 

		for(int i=0; i<n;++i) {

			list.add(scan.nextLine());

		}

		Stack<Character> st = new Stack<Character>();

		

		for(int i=0; i<list.size(); i++) {

			flag=0;

			String temp = list.get(i);

			char[] ch = temp.toCharArray();

			st.clear();

			

			for(int j=0; j<ch.length;j++) {

				char c = ch[j];

				if(c=='{'||c=='('||c=='[') {

					st.push(c);

				}

				else if(c=='}') {

					if(!st.empty()) {

						if(st.peek()=='{') {

							st.pop();

							flag=0;

						}

					}

					else {

						flag=1;

					}

				}

				else if(c==']') {

					if(!st.empty()) {

						if(st.peek()=='[') {

							st.pop();

							flag=0;

						}

					}

					else {

						flag=1;

					}

				}

				else if(c==')') {

					if(!st.empty()) {

						if(st.peek()=='(') {

							st.pop();

							flag=0;

						}

					}

					else {

						flag=1;

					}

				}



			}



			if(flag==1) {

				arr[i]="FALSE";

			}

			else if(st.empty() && flag==1) {

				arr[i]="FALSE";

				}

			else if(st.empty() &&flag==0){

				arr[i]="TRUE";

			}



		}

		

		for(int i=0; i<arr.length-1;i++) {

			System.out.println(arr[i]);

		}

		System.out.print(arr[arr.length-1]);

		scan.close();

	}



}