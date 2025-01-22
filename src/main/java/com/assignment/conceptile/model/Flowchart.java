package com.assignment.conceptile.model;

import com.assignment.conceptile.dto.FlowchartDTO.Edge;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("flowchart")
public class Flowchart {
  @Id private String id;
  private List<Integer> nodes;
  private List<Edge> edges;
}
