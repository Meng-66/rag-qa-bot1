# 基于 RAG 的智能文档问答系统

## 项目简介

这是一个基于 RAG（检索增强生成）架构的智能文档问答系统，用户上传文档后，可以用自然语言提问，系统会基于文档内容给出准确回答。

## 技术栈

- **后端**：Java 17、Spring Boot 3.5、Spring AI 1.1
- **大模型**：智谱 AI GLM-4-Flash
- **数据库**：MySQL 8.0、Spring Data JPA
- **前端**：Thymeleaf、Bootstrap 5、原生 JavaScript
- **其他**：流式响应、RAG 向量检索

## 功能特性

- ✅ **文档上传**：支持 PDF、TXT、DOCX 等格式文档上传
- ✅ **智能问答**：基于 RAG 架构，从文档中检索相关内容生成回答
- ✅ **流式响应**：逐字输出回答，提升用户体验
- ✅ **对话历史**：对话记录存储到 MySQL，支持历史记录管理
- ✅ **清空对话**：一键清空对话，开始新的会话
- ✅ **多轮对话**：支持上下文记忆，实现多轮对话

## 快速开始

### 环境要求

- JDK 17+
- MySQL 8.0+
- Maven 3.6+

### 步骤

1. **克隆项目**
```bash
git clone https://github.com/Meng-66/rag-qa-bot1.git
cd rag-qa-bot1
