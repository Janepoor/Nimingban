/*
 * Copyright 2017 Hippo Seven
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

package com.hippo.nimingban.scene

import android.support.annotation.CallSuper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/*
 * Created by Hippo on 6/12/2017.
 */

abstract class Ui {

  internal var view: View? = null

  fun create(inflater: LayoutInflater, container: ViewGroup): View {
    val view = onCreate(inflater, container)
    this.view = view
    return view
  }

  fun attach() { onAttach() }

  fun start() { onStart() }

  fun resume() { onResume() }

  fun pause() { onPause() }

  fun stop() { onStop() }

  fun detach() { onDetach() }

  fun destroy() {
    onDestroy()
    view = null
  }

  abstract fun onCreate(inflater: LayoutInflater, container: ViewGroup): View

  @CallSuper
  open fun onAttach() {}

  @CallSuper
  open fun onStart() {}

  @CallSuper
  open fun onResume() {}

  @CallSuper
  open fun onPause() {}

  @CallSuper
  open fun onStop() {}

  @CallSuper
  open fun onDetach() {}

  @CallSuper
  open fun onDestroy() {}
}