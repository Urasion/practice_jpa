package jpabook.jpashop.controller;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberForm {
    @NotEmpty(message = "회원이름은 비어있으면 안된다.")
    private String name;
    private String city;
    private String street;
    private String zipcode;
}
