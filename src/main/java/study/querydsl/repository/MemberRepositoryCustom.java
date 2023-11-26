package study.querydsl.repository;

import study.querydsl.dto.MemberSerachCondition;
import study.querydsl.dto.MemberTeamDto;

import java.util.List;

/*
 * 사용자 정의 Repository 사용법
 * 1. 사용자 정의 인터페이스 작성
 * 2. 사용자 정의 인터페이스 구현
 * 3. 스프링 데이터 Repository에 사용자 정의 인터페이스 상속
 * */
public interface MemberRepositoryCustom {
    List<MemberTeamDto> search(MemberSerachCondition condition);
}
