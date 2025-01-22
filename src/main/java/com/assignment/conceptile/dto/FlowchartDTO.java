package com.assignment.conceptile.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FlowchartDTO {
  private String id;
  private List<Integer> nodes;
  private List<Edge> edges;

  @Getter
  @Setter
  @AllArgsConstructor
  @NoArgsConstructor
  public static class Edge {
    private Integer from;
    private Integer to;
  }
}
