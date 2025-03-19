package com.grepp.llm.gemini.text.vo;

import java.util.List;

public record ResponseDocument(
    List<Candidate> candidates
) {

}
