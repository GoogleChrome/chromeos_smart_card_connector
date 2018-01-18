/*
 * Copyright 2015 The Closure Compiler Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;

/** GWT compatible no-op replacement for {@code CoverageInstrumentationPass} */
public class CoverageInstrumentationPass implements CompilerPass {
  /** Coverage Reach */
  public enum CoverageReach {
    ALL,
    CONDITIONAL
  }

  /** Instrument Option */
  public enum InstrumentOption {
    ALL,   // Instrument to collect both line coverage and branch coverage.
    LINE_ONLY,  // Collect coverage for every executable statement.
    BRANCH_ONLY  // Collect coverage for control-flow branches.
  }

  public CoverageInstrumentationPass(AbstractCompiler compiler, CoverageReach reach) {
  }

  public CoverageInstrumentationPass(
      AbstractCompiler compiler, CoverageReach reach, InstrumentOption notUsed) {
  }

  @Override
  public void process(Node externs, Node root) {
  }
}