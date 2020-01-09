package cn.springbootjpajwt.demo.repository;

import cn.springbootjpajwt.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @www.codesheep.cn
 * 20190312
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
