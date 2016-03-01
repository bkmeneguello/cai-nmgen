package org.critterai.nmgen;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Unit tests for all classes in the org.critterai.nav package.
 */
@RunWith(Suite.class)
@SuiteClasses( {GeometryTest.class
    , OpenHeightSpanTest.class
    , EncompassedNullRegionTest.class
    , NullRegionOuterCornerTipTest.class
    , NullRegionShortWrapTest.class
    , RemoveIntersectingSegmentTest.class
    , RemoveVerticalSegmentTest.class} )
public final class AllTest { }
