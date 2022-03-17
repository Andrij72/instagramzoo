package com.akul.instagramzoo.web.facade;

import com.akul.instagramzoo.Entity.Comment;
import com.akul.instagramzoo.dto.CommentDTO;
import org.springframework.stereotype.Component;

@Component
public class CommentFacade {

    public CommentDTO commentToCommentDTO(Comment comment) {
        CommentDTO commentDTO = new CommentDTO();
        commentDTO.setId(comment.getId());
        commentDTO.setUsername(comment.getUsername());
        commentDTO.setMessage(comment.getMessage());

        return commentDTO;
    }

}
