package org.example.repository;

import org.example.model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//제네릭으로 앞에는 데이터베이스테이블과 연결될 객체,
//뒤에는 해당객체의 아이디에 해당하는 필드타입
//데이터베이스에 TodoEntity만 저장하면 됨
//todorequest, todoresponse는 요청 받고 응답 내려주기 위한 모델이여서
//데이터베이스에 저장할 필요는 없다
// jpa레퍼지토리를 상속받는 인터페이스 작성
@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Long> {

}
