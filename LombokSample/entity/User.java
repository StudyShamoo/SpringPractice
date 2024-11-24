package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * Getter,SetterアノテーションはDataアノテーションに置き換え可能
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	/** 名前 */
	private String name;
	/** 年齢 */
	private int age;
}
