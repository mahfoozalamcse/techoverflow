package com.mahfooz.blog.repositories;

import com.mahfooz.blog.domain.PostStatus;
import com.mahfooz.blog.domain.entities.Category;
import com.mahfooz.blog.domain.entities.Post;
import com.mahfooz.blog.domain.entities.Tag;
import com.mahfooz.blog.domain.entities.User;
import com.mahfooz.blog.services.PostService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {
    List<Post> findAllByStatusAndCategoryAndTagsContaining(PostStatus status, Category category, Tag tag);
    List<Post> findAllByStatusAndCategory(PostStatus status, Category category);
    List<Post> findAllByStatusAndTagsContaining(PostStatus status, Tag tag);
    List<Post> findAllByStatus(PostStatus status);
    List<Post> findAllByAuthorAndStatus(User author, PostStatus status);
}
