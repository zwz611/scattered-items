package org.alien.mybatis.samples.mapper;

import org.alien.mybatis.samples.model.Blog;

import java.util.List;

/**
 * Created by andychen on 2015/5/8.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public interface BlogMapper {

    /**
     * Only fill id, Author properties of Blog.
     *
     * @return Blog info with id and author.
     */
    Blog getBlogOneToOne();

    /**
     * Get Blog full info.
     *
     * @return Blog
     */
    List<Blog> getAllBlog();
}
