package com.uichesoh.api.gateway;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class RequestDto {
    private String uri;
    private String method;
}
