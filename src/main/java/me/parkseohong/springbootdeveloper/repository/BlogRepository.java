package me.parkseohong.springbootdeveloper.repository;

import me.parkseohong.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
