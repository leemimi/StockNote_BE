package org.com.stocknote.domain.user.entity;

import jakarta.persistence.Entity;
import lombok.*;
import org.com.stocknote.global.base.BaseEntity;

import static lombok.AccessLevel.PROTECTED;

@Entity
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PROTECTED)
@Builder
@Getter
@Setter
public class User extends BaseEntity {
    private String name; //이름
    private String account; //아이디
    private String password; //비밀번호
    private String email; //이메일
    private String introduction; //자기소개(한줄소개)


}
