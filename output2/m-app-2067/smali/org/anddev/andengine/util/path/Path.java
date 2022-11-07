public class org.anddev.andengine.util.path.Path {
	 /* # instance fields */
	 private final java.util.ArrayList mSteps;
	 /* # direct methods */
	 public org.anddev.andengine.util.path.Path ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mSteps = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void append ( Integer p0, Integer p1 ) {
		 /* .locals 1 */
		 /* new-instance v0, Lorg/anddev/andengine/util/path/Path$Step; */
		 /* invoke-direct {v0, p0, p1, p2}, Lorg/anddev/andengine/util/path/Path$Step;-><init>(Lorg/anddev/andengine/util/path/Path;II)V */
		 (( org.anddev.andengine.util.path.Path ) p0 ).append ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/util/path/Path;->append(Lorg/anddev/andengine/util/path/Path$Step;)V
		 return;
	 } // .end method
	 public void append ( org.anddev.andengine.util.path.Path$Step p0 ) {
		 /* .locals 1 */
		 v0 = this.mSteps;
		 (( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
		 return;
	 } // .end method
	 public Boolean contains ( Integer p0, Integer p1 ) {
		 /* .locals 4 */
		 int v3 = 1; // const/4 v3, 0x1
		 v0 = this.mSteps;
		 v1 = 		 (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
		 /* sub-int/2addr v1, v3 */
	 } // :goto_0
	 /* if-gez v1, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_1
} // :cond_0
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/util/path/Path$Step; */
v2 = (( org.anddev.andengine.util.path.Path$Step ) p0 ).getTileColumn ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/path/Path$Step;->getTileColumn()I
/* if-ne v2, p1, :cond_1 */
v2 = (( org.anddev.andengine.util.path.Path$Step ) p0 ).getTileRow ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/path/Path$Step;->getTileRow()I
/* if-ne v2, p2, :cond_1 */
/* move v0, v3 */
} // :cond_1
/* add-int/lit8 v1, v1, -0x1 */
} // .end method
public org.anddev.andengine.util.path.Direction getDirectionToNextStep ( Integer p0 ) {
/* .locals 3 */
v0 = (( org.anddev.andengine.util.path.Path ) p0 ).getLength ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/path/Path;->getLength()I
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
/* if-ne p1, v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
/* add-int/lit8 v0, p1, 0x1 */
v0 = (( org.anddev.andengine.util.path.Path ) p0 ).getTileColumn ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/util/path/Path;->getTileColumn(I)I
v1 = (( org.anddev.andengine.util.path.Path ) p0 ).getTileColumn ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/util/path/Path;->getTileColumn(I)I
/* sub-int/2addr v0, v1 */
/* add-int/lit8 v1, p1, 0x1 */
v1 = (( org.anddev.andengine.util.path.Path ) p0 ).getTileRow ( v1 ); // invoke-virtual {p0, v1}, Lorg/anddev/andengine/util/path/Path;->getTileRow(I)I
v2 = (( org.anddev.andengine.util.path.Path ) p0 ).getTileRow ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/util/path/Path;->getTileRow(I)I
/* sub-int/2addr v1, v2 */
org.anddev.andengine.util.path.Direction .fromDelta ( v0,v1 );
} // .end method
public org.anddev.andengine.util.path.Direction getDirectionToPreviousStep ( Integer p0 ) {
/* .locals 3 */
int v2 = 1; // const/4 v2, 0x1
/* if-nez p1, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
/* sub-int v0, p1, v2 */
v0 = (( org.anddev.andengine.util.path.Path ) p0 ).getTileColumn ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/util/path/Path;->getTileColumn(I)I
v1 = (( org.anddev.andengine.util.path.Path ) p0 ).getTileColumn ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/util/path/Path;->getTileColumn(I)I
/* sub-int/2addr v0, v1 */
/* sub-int v1, p1, v2 */
v1 = (( org.anddev.andengine.util.path.Path ) p0 ).getTileRow ( v1 ); // invoke-virtual {p0, v1}, Lorg/anddev/andengine/util/path/Path;->getTileRow(I)I
v2 = (( org.anddev.andengine.util.path.Path ) p0 ).getTileRow ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/util/path/Path;->getTileRow(I)I
/* sub-int/2addr v1, v2 */
org.anddev.andengine.util.path.Direction .fromDelta ( v0,v1 );
} // .end method
public Integer getFromTileColumn ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
v0 = (( org.anddev.andengine.util.path.Path ) p0 ).getTileColumn ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/util/path/Path;->getTileColumn(I)I
} // .end method
public Integer getFromTileRow ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
v0 = (( org.anddev.andengine.util.path.Path ) p0 ).getTileRow ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/util/path/Path;->getTileRow(I)I
} // .end method
public Integer getLength ( ) {
/* .locals 1 */
v0 = this.mSteps;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
} // .end method
public org.anddev.andengine.util.path.Path$Step getStep ( Integer p0 ) {
/* .locals 1 */
v0 = this.mSteps;
(( java.util.ArrayList ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/util/path/Path$Step; */
} // .end method
public Integer getTileColumn ( Integer p0 ) {
/* .locals 1 */
(( org.anddev.andengine.util.path.Path ) p0 ).getStep ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/util/path/Path;->getStep(I)Lorg/anddev/andengine/util/path/Path$Step;
v0 = (( org.anddev.andengine.util.path.Path$Step ) v0 ).getTileColumn ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/util/path/Path$Step;->getTileColumn()I
} // .end method
public Integer getTileRow ( Integer p0 ) {
/* .locals 1 */
(( org.anddev.andengine.util.path.Path ) p0 ).getStep ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/util/path/Path;->getStep(I)Lorg/anddev/andengine/util/path/Path$Step;
v0 = (( org.anddev.andengine.util.path.Path$Step ) v0 ).getTileRow ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/util/path/Path$Step;->getTileRow()I
} // .end method
public Integer getToTileColumn ( ) {
/* .locals 2 */
v0 = this.mSteps;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
v0 = (( org.anddev.andengine.util.path.Path ) p0 ).getTileColumn ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/util/path/Path;->getTileColumn(I)I
} // .end method
public Integer getToTileRow ( ) {
/* .locals 2 */
v0 = this.mSteps;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
v0 = (( org.anddev.andengine.util.path.Path ) p0 ).getTileRow ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/util/path/Path;->getTileRow(I)I
} // .end method
public void prepend ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* new-instance v0, Lorg/anddev/andengine/util/path/Path$Step; */
/* invoke-direct {v0, p0, p1, p2}, Lorg/anddev/andengine/util/path/Path$Step;-><init>(Lorg/anddev/andengine/util/path/Path;II)V */
(( org.anddev.andengine.util.path.Path ) p0 ).prepend ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/util/path/Path;->prepend(Lorg/anddev/andengine/util/path/Path$Step;)V
return;
} // .end method
public void prepend ( org.anddev.andengine.util.path.Path$Step p0 ) {
/* .locals 2 */
v0 = this.mSteps;
int v1 = 0; // const/4 v1, 0x0
(( java.util.ArrayList ) v0 ).add ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
return;
} // .end method
