package com.git.hui.springai.app;

import com.git.hui.springai.app.vectorstore.TextBasedVectorStore;
import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.vectorstore.SimpleVectorStore;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class D05Application {
    @Bean
    public VectorStore vectorStore() {
        return TextBasedVectorStore.builder().build();
    }


//    @Bean
    public VectorStore vectorStore(EmbeddingModel embeddingModel) {
        return SimpleVectorStore.builder(embeddingModel).build();
    }
    public static void main(String[] args) {
        SpringApplication.run(D05Application.class, args);
        System.out.println("启动成功，前端测试访问地址： http://localhost:8080/chat");
    }
}