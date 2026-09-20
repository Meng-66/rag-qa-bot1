package com.git.hui.springai.app.repository;

import com.git.hui.springai.app.entity.ConversationMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 对话历史 Repository
 */
public interface ConversationMessageRepository extends JpaRepository<ConversationMessage, Long> {

    /**
     * 根据对话ID查询历史消息，按时间升序
     */
    List<ConversationMessage> findByChatIdOrderByCreatedAtAsc(String chatId);
}
