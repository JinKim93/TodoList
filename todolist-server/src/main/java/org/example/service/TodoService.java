package org.example.service;

import lombok.AllArgsConstructor;
import org.example.model.TodoEntity;
import org.example.model.TodoRequest;
import org.example.repository.TodoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    // 리스트 목록에 아이템 추가
    public TodoEntity add(TodoRequest request) {
        TodoEntity todoEntity = new TodoEntity();
        todoEntity.setTitle(request.getTitle());
        todoEntity.setOrder(request.getOrder());
        todoEntity.setCompleted(request.getCompleted());
        return this.todoRepository.save(todoEntity);
    }

    // 아이템 조회 -> id기준으로 조회
    public TodoEntity searchById(Long id){

      return this.todoRepository.findById(id)
              //값이 없으면 notfondt 404 exception 날려줌
              .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

    }

    //리스트 전체 목록을 조회
    public List<TodoEntity> searchAll() {

        return this.todoRepository.findAll();
    }

    //특정 아이템을 수정
    //TodoRequest request로 어떤값으로 바꿀지도 받는다
    public TodoEntity updateById(Long id,TodoRequest request) {
        //1. 업데이트니까 기존에 있는 id 업데이트 해야함
        TodoEntity todoEntity = this.searchById(id);
        if(request.getTitle() != null) {
            todoEntity.setTitle(request.getTitle());
        }

        if(request.getOrder() != null) {
            todoEntity.setOrder(request.getOrder());
        }

        if(request.getCompleted() != null) {
            todoEntity.setCompleted(request.getCompleted());
        }
        return this.todoRepository.save(todoEntity);
    }

    //특정 아이템 삭제
    public void deleteById(Long id){
        this.todoRepository.deleteById(id);

    }
    //전체 목록 삭제
    public void deleteAll(){
        this.todoRepository.deleteAll();

    }
}
