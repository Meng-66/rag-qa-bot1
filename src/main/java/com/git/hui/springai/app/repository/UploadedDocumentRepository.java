package com.git.hui.springai.app.repository;

import com.git.hui.springai.app.entity.UploadedDocument;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 上传文档 Repository
 */
public interface UploadedDocumentRepository extends JpaRepository<UploadedDocument, Long> {

    /**
     * 根据对话ID查询上传的文档列表，按上传时间降序
     */
    List<UploadedDocument> findByChatIdOrderByUploadTimeDesc(String chatId);
}
