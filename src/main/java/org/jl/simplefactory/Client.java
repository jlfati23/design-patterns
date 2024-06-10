package org.jl.simplefactory;

public class Client {

	public static void main(String[] args) {

		Post post = PostSimpleFactory.createPost("Blog");
		String content = post.getContent();
		System.out.println(content);

	}

}
