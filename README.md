# 基于 RAG 的智能文档问答系统

## 项目简介

这是一个基于 RAG（检索增强生成）架构的智能文档问答系统，用户上传文档后，可以用自然语言提问，系统会基于文档内容给出准确回答。

## 技术栈

- **后端**：Java 17、Spring Boot 3.5、Spring AI 1.1
- **大模型**：智谱 AI GLM-4-Flash
- **数据库**：MySQL 8.0、Spring Data JPA
- **前端**：Thymeleaf、Bootstrap 5、原生 JavaScript
- **其他**：WebSocket 流式响应、RAG 向量检索

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
```

2. **配置数据库**

创建 MySQL 数据库：
```sql
CREATE DATABASE rag_qa DEFAULT CHARACTER SET utf8mb4;
```

3. **修改配置**

修改 `src/main/resources/application.yml`：
- 配置 MySQL 用户名和密码
- 配置智谱 AI API Key

4. **启动项目**
```bash
mvn spring-boot:run
```

5. **访问**

浏览器打开：http://localhost:8080/chat

## 项目结构

```
src/main/java/com/git/hui/springai/app/
├── D05Application.java          # 启动类
├── entity/
│   └── ConversationMessage.java # 对话历史实体
├── repository/
│   └── ConversationMessageRepository.java # 数据访问层
├── qa/
│   └── QaBoltService.java       # 核心业务逻辑（RAG、对话管理）
├── mvc/
│   ├── QaController.java        # 页面跳转
│   └── QaApiController.java     # API 接口
└── vectorstore/
    └── TextBasedVectorStore.java # 向量存储
```

## 核心技术点

1. **RAG 检索增强生成**：文档切片 → 向量嵌入 → 语义检索 → 上下文增强 → 大模型生成
2. **流式响应**：基于 SSE（Server-Sent Events）实现逐字输出
3. **多轮对话**：基于 ChatMemory 维护上下文
4. **对话持久化**：Spring Data JPA 操作 MySQL 存储对话历史

## 联系方式

- GitHub: [Meng-66](https://github.com/Meng-66)
