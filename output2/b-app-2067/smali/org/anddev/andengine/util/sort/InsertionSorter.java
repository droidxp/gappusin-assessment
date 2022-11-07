public class org.anddev.andengine.util.sort.InsertionSorter extends org.anddev.andengine.util.sort.Sorter {
	 /* # direct methods */
	 public org.anddev.andengine.util.sort.InsertionSorter ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/util/sort/Sorter;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void sort ( java.util.List p0, Integer p1, Integer p2, java.util.Comparator p3 ) {
		 /* .locals 6 */
		 int v5 = 1; // const/4 v5, 0x1
		 /* add-int/lit8 v0, p2, 0x1 */
	 } // :goto_0
	 /* if-lt v0, p3, :cond_0 */
	 return;
} // :cond_0
v3 = /* sub-int v2, v0, v5 */
/* if-gez v3, :cond_2 */
/* move-object v3, v2 */
/* move v2, v0 */
} // :goto_1
/* add-int/lit8 v4, v2, -0x1 */
/* if-le v4, p2, :cond_1 */
v3 = /* sub-int v2, v4, v5 */
/* if-ltz v3, :cond_3 */
} // :cond_1
} // :cond_2
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_3
/* move-object v3, v2 */
/* move v2, v4 */
} // .end method
public void sort ( java.lang.Object[] p0, Integer p1, Integer p2, java.util.Comparator p3 ) {
/* .locals 6 */
int v5 = 1; // const/4 v5, 0x1
/* add-int/lit8 v0, p2, 0x1 */
} // :goto_0
/* if-lt v0, p3, :cond_0 */
return;
} // :cond_0
/* aget-object v1, p1, v0 */
/* sub-int v2, v0, v5 */
v3 = /* aget-object v2, p1, v2 */
/* if-gez v3, :cond_2 */
/* move-object v3, v2 */
/* move v2, v0 */
} // :goto_1
/* add-int/lit8 v4, v2, -0x1 */
/* aput-object v3, p1, v2 */
/* if-le v4, p2, :cond_1 */
/* sub-int v2, v4, v5 */
v3 = /* aget-object v2, p1, v2 */
/* if-ltz v3, :cond_3 */
} // :cond_1
/* aput-object v1, p1, v4 */
} // :cond_2
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_3
/* move-object v3, v2 */
/* move v2, v4 */
} // .end method
