package com.example.demo.handler.model.requestEvent;

import com.example.demo.PojaGenerated;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@PojaGenerated
@Getter
@Setter
public class IAM {
  @JsonProperty("accessKey")
  private String accessKey;

  @JsonProperty("accountId")
  private String accountId;

  @JsonProperty("callerId")
  private String callerId;

  @JsonProperty("principalOrgId")
  private String principalOrgId;

  @JsonProperty("userArn")
  private String userArn;

  @JsonProperty("userId")
  private String userId;
}
