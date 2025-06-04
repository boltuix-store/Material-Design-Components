/*
 * Copyright 2017 The Android Open Source Project
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

package io.materialdesign.catalog.tableofcontents;

import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import io.materialdesign.catalog.adaptive.AdaptiveFragment;
import io.materialdesign.catalog.application.scope.FragmentScope;
import io.materialdesign.catalog.bottomappbar.BottomAppBarFragment;
import io.materialdesign.catalog.bottomnav.BottomNavigationFragment;
import io.materialdesign.catalog.bottomsheet.BottomSheetFragment;
import io.materialdesign.catalog.button.ButtonsFragment;
import io.materialdesign.catalog.card.CardFragment;
import io.materialdesign.catalog.carousel.CarouselFragment;
import io.materialdesign.catalog.checkbox.CheckBoxFragment;
import io.materialdesign.catalog.chip.ChipFragment;
import io.materialdesign.catalog.color.ColorsFragment;
import io.materialdesign.catalog.datepicker.DatePickerDemoLandingFragment;
import io.materialdesign.catalog.dialog.DialogDemoLandingFragment;
import io.materialdesign.catalog.divider.DividerFragment;
import io.materialdesign.catalog.dockedtoolbar.DockedToolbarFragment;
import io.materialdesign.catalog.elevation.ElevationFragment;
import io.materialdesign.catalog.fab.FabFragment;
import io.materialdesign.catalog.floatingtoolbar.FloatingToolbarFragment;
import io.materialdesign.catalog.font.FontFragment;
import io.materialdesign.catalog.imageview.ShapeableImageViewFragment;
import io.materialdesign.catalog.loadingindicator.LoadingIndicatorFragment;
import io.materialdesign.catalog.materialswitch.SwitchFragment;
import io.materialdesign.catalog.menu.MenuFragment;
import io.materialdesign.catalog.navigationdrawer.NavigationDrawerFragment;
import io.materialdesign.catalog.navigationrail.NavigationRailFragment;
import io.materialdesign.catalog.preferences.CatalogPreferencesDialogFragment;
import io.materialdesign.catalog.progressindicator.ProgressIndicatorFragment;
import io.materialdesign.catalog.radiobutton.RadioButtonFragment;
import io.materialdesign.catalog.search.SearchFragment;
import io.materialdesign.catalog.shapetheming.ShapeThemingFragment;
import io.materialdesign.catalog.sidesheet.SideSheetFragment;
import io.materialdesign.catalog.slider.SliderFragment;
import io.materialdesign.catalog.tabs.TabsFragment;
import io.materialdesign.catalog.textfield.TextFieldFragment;
import io.materialdesign.catalog.timepicker.TimePickerDemoLandingFragment;
import io.materialdesign.catalog.topappbar.TopAppBarFragment;
import io.materialdesign.catalog.transition.TransitionFragment;

/** The Dagger module for {@link TocFragment} dependencies. */
@dagger.Module(
    includes = {
      AdaptiveFragment.Module.class,
      BottomAppBarFragment.Module.class,
      ButtonsFragment.Module.class,
      BottomNavigationFragment.Module.class,
      BottomSheetFragment.Module.class,
      CardFragment.Module.class,
      CarouselFragment.Module.class,
      CheckBoxFragment.Module.class,
      ChipFragment.Module.class,
      ColorsFragment.Module.class,
      DatePickerDemoLandingFragment.Module.class,
      DialogDemoLandingFragment.Module.class,
      DividerFragment.Module.class,
      DockedToolbarFragment.Module.class,
      ElevationFragment.Module.class,
      FabFragment.Module.class,
      FloatingToolbarFragment.Module.class,
      FontFragment.Module.class,
      LoadingIndicatorFragment.Module.class,
      MenuFragment.Module.class,
      NavigationDrawerFragment.Module.class,
      NavigationRailFragment.Module.class,
      ProgressIndicatorFragment.Module.class,
      RadioButtonFragment.Module.class,
      SearchFragment.Module.class,
      ShapeableImageViewFragment.Module.class,
      ShapeThemingFragment.Module.class,
      SideSheetFragment.Module.class,
      SliderFragment.Module.class,
      SwitchFragment.Module.class,
      TabsFragment.Module.class,
      TextFieldFragment.Module.class,
      TimePickerDemoLandingFragment.Module.class,
      TopAppBarFragment.Module.class,
      TransitionFragment.Module.class
    })
public abstract class TocModule {
  @FragmentScope
  @ContributesAndroidInjector
  abstract TocFragment contributeTocFragment();

  @FragmentScope
  @ContributesAndroidInjector
  abstract CatalogPreferencesDialogFragment contributeCatalogPreferencesDialogFragment();

  @Provides
  static TocResourceProvider provideTocResourceProvider() {
    return new TocResourceProvider();
  }
}
