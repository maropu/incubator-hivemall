/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package hivemall.math.matrix;

import javax.annotation.Nonnegative;

public abstract class RowMajorFloatMatrix extends RowMajorMatrix implements FloatMatrix {

    public RowMajorFloatMatrix() {
        super();
    }

    @Override
    public RowMajorFloatMatrix toRowMajorMatrix() {
        return this;
    }

    @Override
    public double get(@Nonnegative final int row, @Nonnegative final int col,
            final double defaultValue) {
        return get(row, col, (float) defaultValue);
    }

    @Override
    public void set(@Nonnegative final int row, @Nonnegative final int col, final double value) {
        set(row, col, (float) value);
    }

    @Override
    public double getAndSet(@Nonnegative final int row, @Nonnegative final int col,
            final double value) {
        return getAndSet(row, col, (float) value);
    }

}
