/*
 * Copyright (C) 2018 The Tachiyomi Open Source Project
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package tachiyomi.domain.category.interactor

import io.reactivex.Flowable
import tachiyomi.domain.category.CategoryWithCount
import tachiyomi.domain.category.repository.CategoryRepository
import javax.inject.Inject

class SubscribeCategoriesWithCount @Inject constructor(
  private val categoryRepository: CategoryRepository
) {

  fun interact(): Flowable<List<CategoryWithCount>> {
    return categoryRepository.getCategoriesWithCount()
  }

}
