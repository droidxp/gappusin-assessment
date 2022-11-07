public class org.anddev.andengine.util.MultiKeyHashMap extends java.util.HashMap {
	 /* # static fields */
	 private static final Long serialVersionUID;
	 /* # direct methods */
	 public org.anddev.andengine.util.MultiKeyHashMap ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/util/HashMap;-><init>()V */
		 return;
	 } // .end method
	 private Boolean isEqualKey ( java.lang.Object[] p0, java.lang.Object[] p1 ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* array-length v0, p1 */
		 /* array-length v1, p2 */
		 /* if-eq v0, v1, :cond_0 */
		 /* move v0, v3 */
	 } // :goto_0
} // :cond_0
/* move v0, v3 */
} // :goto_1
/* array-length v1, p1 */
/* if-lt v0, v1, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
/* aget-object v1, p1, v0 */
/* aget-object v2, p2, v0 */
/* if-nez v1, :cond_2 */
if ( v2 != null) { // if-eqz v2, :cond_3
/* move v0, v3 */
} // :cond_2
v1 = (( java.lang.Object ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_3 */
/* move v0, v3 */
} // :cond_3
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
/* # virtual methods */
public java.lang.Object get ( java.lang.Object...p0 ) {
/* .locals 5 */
v2 = org.anddev.andengine.util.MultiKey .hash ( p1 );
(( org.anddev.andengine.util.MultiKeyHashMap ) p0 ).entrySet ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/MultiKeyHashMap;->entrySet()Ljava/util/Set;
v0 = } // :cond_0
/* if-nez v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_1
/* check-cast v0, Ljava/util/Map$Entry; */
/* check-cast v1, Lorg/anddev/andengine/util/MultiKey; */
v4 = (( org.anddev.andengine.util.MultiKey ) v1 ).hashCode ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/util/MultiKey;->hashCode()I
/* if-ne v4, v2, :cond_0 */
(( org.anddev.andengine.util.MultiKey ) v1 ).getKeys ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/util/MultiKey;->getKeys()[Ljava/lang/Object;
v1 = /* invoke-direct {p0, v1, p1}, Lorg/anddev/andengine/util/MultiKeyHashMap;->isEqualKey([Ljava/lang/Object;[Ljava/lang/Object;)Z */
if ( v1 != null) { // if-eqz v1, :cond_0
} // .end method
