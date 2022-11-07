public class inal {
	 /* .source "BytesToNameCanonicalizer.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket; */
	 /* } */
} // .end annotation
/* # static fields */
protected static final Integer DEFAULT_TABLE_SIZE;
static final Integer INITIAL_COLLISION_LEN;
static final Integer LAST_VALID_BUCKET;
static final Integer MAX_ENTRIES_FOR_REUSE;
protected static final Integer MAX_TABLE_SIZE;
static final Integer MIN_HASH_SIZE;
/* # instance fields */
private Integer _collCount;
private Integer _collEnd;
private org.codehaus.jackson.sym.BytesToNameCanonicalizer$Bucket _collList;
private Boolean _collListShared;
private Integer _count;
final Boolean _intern;
private _mainHash;
private Integer _mainHashMask;
private Boolean _mainHashShared;
private org.codehaus.jackson.sym.Name _mainNames;
private Boolean _mainNamesShared;
private transient Boolean _needRehash;
final org.codehaus.jackson.sym.BytesToNameCanonicalizer _parent;
/* # direct methods */
private inal ( ) {
	 /* .locals 2 */
	 /* .param p1, "hashSize" # I */
	 /* .param p2, "intern" # Z */
	 /* .prologue */
	 /* .line 200 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 201 */
	 int v1 = 0; // const/4 v1, 0x0
	 this._parent = v1;
	 /* .line 202 */
	 /* iput-boolean p2, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_intern:Z */
	 /* .line 206 */
	 /* const/16 v1, 0x10 */
	 /* if-ge p1, v1, :cond_1 */
	 /* .line 207 */
	 /* const/16 p1, 0x10 */
	 /* .line 220 */
} // :cond_0
} // :goto_0
/* invoke-direct {p0, p1}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->initTables(I)V */
/* .line 221 */
return;
/* .line 212 */
} // :cond_1
/* add-int/lit8 v1, p1, -0x1 */
/* and-int/2addr v1, p1 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 213 */
/* const/16 v0, 0x10 */
/* .line 214 */
/* .local v0, "curr":I */
} // :goto_1
/* if-ge v0, p1, :cond_2 */
/* .line 215 */
/* add-int/2addr v0, v0 */
/* .line 217 */
} // :cond_2
/* move p1, v0 */
} // .end method
private inal ( ) {
/* .locals 2 */
/* .param p1, "parent" # Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer; */
/* .param p2, "intern" # Z */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 227 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 228 */
this._parent = p1;
/* .line 229 */
/* iput-boolean p2, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_intern:Z */
/* .line 232 */
/* iget v0, p1, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_count:I */
/* iput v0, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_count:I */
/* .line 233 */
/* iget v0, p1, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainHashMask:I */
/* iput v0, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainHashMask:I */
/* .line 234 */
v0 = this._mainHash;
this._mainHash = v0;
/* .line 235 */
v0 = this._mainNames;
this._mainNames = v0;
/* .line 236 */
v0 = this._collList;
this._collList = v0;
/* .line 237 */
/* iget v0, p1, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collCount:I */
/* iput v0, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collCount:I */
/* .line 238 */
/* iget v0, p1, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collEnd:I */
/* iput v0, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collEnd:I */
/* .line 239 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_needRehash:Z */
/* .line 241 */
/* iput-boolean v1, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainHashShared:Z */
/* .line 242 */
/* iput-boolean v1, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainNamesShared:Z */
/* .line 243 */
/* iput-boolean v1, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collListShared:Z */
/* .line 244 */
return;
} // .end method
private void _addSymbol ( Integer p0, org.codehaus.jackson.sym.Name p1 ) {
/* .locals 9 */
/* .param p1, "hash" # I */
/* .param p2, "symbol" # Lorg/codehaus/jackson/sym/Name; */
/* .prologue */
int v8 = 1; // const/4 v8, 0x1
/* .line 610 */
/* iget-boolean v5, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainHashShared:Z */
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 611 */
/* invoke-direct {p0}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->unshareMain()V */
/* .line 614 */
} // :cond_0
/* iget-boolean v5, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_needRehash:Z */
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 615 */
/* invoke-direct {p0}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->rehash()V */
/* .line 618 */
} // :cond_1
/* iget v5, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_count:I */
/* add-int/lit8 v5, v5, 0x1 */
/* iput v5, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_count:I */
/* .line 623 */
/* iget v5, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainHashMask:I */
/* and-int v4, p1, v5 */
/* .line 624 */
/* .local v4, "ix":I */
v5 = this._mainNames;
/* aget-object v5, v5, v4 */
/* if-nez v5, :cond_4 */
/* .line 625 */
v5 = this._mainHash;
/* shl-int/lit8 v6, p1, 0x8 */
/* aput v6, v5, v4 */
/* .line 626 */
/* iget-boolean v5, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainNamesShared:Z */
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 627 */
/* invoke-direct {p0}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->unshareNames()V */
/* .line 629 */
} // :cond_2
v5 = this._mainNames;
/* aput-object p2, v5, v4 */
/* .line 666 */
} // :goto_0
v5 = this._mainHash;
/* array-length v3, v5 */
/* .line 667 */
/* .local v3, "hashSize":I */
/* iget v5, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_count:I */
/* shr-int/lit8 v6, v3, 0x1 */
/* if-le v5, v6, :cond_3 */
/* .line 668 */
/* shr-int/lit8 v2, v3, 0x2 */
/* .line 672 */
/* .local v2, "hashQuarter":I */
/* iget v5, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_count:I */
/* sub-int v6, v3, v2 */
/* if-le v5, v6, :cond_9 */
/* .line 673 */
/* iput-boolean v8, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_needRehash:Z */
/* .line 679 */
} // .end local v2 # "hashQuarter":I
} // :cond_3
} // :goto_1
return;
/* .line 634 */
} // .end local v3 # "hashSize":I
} // :cond_4
/* iget-boolean v5, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collListShared:Z */
if ( v5 != null) { // if-eqz v5, :cond_5
/* .line 635 */
/* invoke-direct {p0}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->unshareCollision()V */
/* .line 638 */
} // :cond_5
/* iget v5, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collCount:I */
/* add-int/lit8 v5, v5, 0x1 */
/* iput v5, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collCount:I */
/* .line 639 */
v5 = this._mainHash;
/* aget v1, v5, v4 */
/* .line 640 */
/* .local v1, "entryValue":I */
/* and-int/lit16 v0, v1, 0xff */
/* .line 641 */
/* .local v0, "bucket":I */
/* if-nez v0, :cond_8 */
/* .line 642 */
/* iget v5, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collEnd:I */
/* const/16 v6, 0xfe */
/* if-gt v5, v6, :cond_7 */
/* .line 643 */
/* iget v0, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collEnd:I */
/* .line 644 */
/* iget v5, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collEnd:I */
/* add-int/lit8 v5, v5, 0x1 */
/* iput v5, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collEnd:I */
/* .line 646 */
v5 = this._collList;
/* array-length v5, v5 */
/* if-lt v0, v5, :cond_6 */
/* .line 647 */
/* invoke-direct {p0}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->expandCollision()V */
/* .line 653 */
} // :cond_6
} // :goto_2
v5 = this._mainHash;
/* and-int/lit16 v6, v1, -0x100 */
/* add-int/lit8 v7, v0, 0x1 */
/* or-int/2addr v6, v7 */
/* aput v6, v5, v4 */
/* .line 659 */
} // :goto_3
v5 = this._collList;
/* new-instance v6, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket; */
v7 = this._collList;
/* aget-object v7, v7, v0 */
/* invoke-direct {v6, p2, v7}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket;-><init>(Lorg/codehaus/jackson/sym/Name;Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket;)V */
/* aput-object v6, v5, v0 */
/* .line 650 */
} // :cond_7
v0 = /* invoke-direct {p0}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->findBestBucket()I */
/* .line 655 */
} // :cond_8
/* add-int/lit8 v0, v0, -0x1 */
/* .line 674 */
} // .end local v0 # "bucket":I
} // .end local v1 # "entryValue":I
/* .restart local v2 # "hashQuarter":I */
/* .restart local v3 # "hashSize":I */
} // :cond_9
/* iget v5, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collCount:I */
/* if-lt v5, v2, :cond_3 */
/* .line 675 */
/* iput-boolean v8, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_needRehash:Z */
} // .end method
public static final Integer calcHash ( Integer p0 ) {
/* .locals 2 */
/* .param p0, "firstQuad" # I */
/* .prologue */
/* .line 499 */
/* move v0, p0 */
/* .line 500 */
/* .local v0, "hash":I */
/* ushr-int/lit8 v1, v0, 0x10 */
/* xor-int/2addr v0, v1 */
/* .line 501 */
/* ushr-int/lit8 v1, v0, 0x8 */
/* xor-int/2addr v0, v1 */
/* .line 502 */
} // .end method
public static final Integer calcHash ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .param p0, "firstQuad" # I */
/* .param p1, "secondQuad" # I */
/* .prologue */
/* .line 507 */
/* mul-int/lit8 v1, p0, 0x1f */
/* add-int v0, v1, p1 */
/* .line 512 */
/* .local v0, "hash":I */
/* ushr-int/lit8 v1, v0, 0x10 */
/* xor-int/2addr v0, v1 */
/* .line 513 */
/* ushr-int/lit8 v1, v0, 0x8 */
/* xor-int/2addr v0, v1 */
/* .line 514 */
} // .end method
public static final Integer calcHash ( Integer[] p0, Integer p1 ) {
/* .locals 4 */
/* .param p0, "quads" # [I */
/* .param p1, "qlen" # I */
/* .prologue */
/* .line 520 */
int v2 = 0; // const/4 v2, 0x0
/* aget v0, p0, v2 */
/* .line 521 */
/* .local v0, "hash":I */
int v1 = 1; // const/4 v1, 0x1
/* .local v1, "i":I */
} // :goto_0
/* if-ge v1, p1, :cond_0 */
/* .line 522 */
/* mul-int/lit8 v2, v0, 0x1f */
/* aget v3, p0, v1 */
/* add-int v0, v2, v3 */
/* .line 521 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 525 */
} // :cond_0
/* ushr-int/lit8 v2, v0, 0x10 */
/* xor-int/2addr v0, v2 */
/* .line 526 */
/* ushr-int/lit8 v2, v0, 0x8 */
/* xor-int/2addr v0, v2 */
/* .line 528 */
} // .end method
private static org.codehaus.jackson.sym.Name constructName ( Integer p0, java.lang.String p1, Integer[] p2, Integer p3 ) {
/* .locals 8 */
/* .param p0, "hash" # I */
/* .param p1, "name" # Ljava/lang/String; */
/* .param p2, "quads" # [I */
/* .param p3, "qlen" # I */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
int v1 = 0; // const/4 v1, 0x0
/* .line 877 */
int v0 = 4; // const/4 v0, 0x4
/* if-ge p3, v0, :cond_0 */
/* .line 878 */
/* packed-switch p3, :pswitch_data_0 */
/* .line 889 */
} // :cond_0
/* new-array v6, p3, [I */
/* .line 890 */
/* .local v6, "buf":[I */
int v7 = 0; // const/4 v7, 0x0
/* .local v7, "i":I */
} // :goto_0
/* if-ge v7, p3, :cond_1 */
/* .line 891 */
/* aget v0, p2, v7 */
/* aput v0, v6, v7 */
/* .line 890 */
/* add-int/lit8 v7, v7, 0x1 */
/* .line 880 */
} // .end local v6 # "buf":[I
} // .end local v7 # "i":I
/* :pswitch_0 */
/* new-instance v0, Lorg/codehaus/jackson/sym/Name1; */
/* aget v1, p2, v1 */
/* invoke-direct {v0, p1, p0, v1}, Lorg/codehaus/jackson/sym/Name1;-><init>(Ljava/lang/String;II)V */
/* .line 893 */
} // :goto_1
/* .line 882 */
/* :pswitch_1 */
/* new-instance v0, Lorg/codehaus/jackson/sym/Name2; */
/* aget v1, p2, v1 */
/* aget v2, p2, v2 */
/* invoke-direct {v0, p1, p0, v1, v2}, Lorg/codehaus/jackson/sym/Name2;-><init>(Ljava/lang/String;III)V */
/* .line 884 */
/* :pswitch_2 */
/* new-instance v0, Lorg/codehaus/jackson/sym/Name3; */
/* aget v3, p2, v1 */
/* aget v4, p2, v2 */
int v1 = 2; // const/4 v1, 0x2
/* aget v5, p2, v1 */
/* move-object v1, p1 */
/* move v2, p0 */
/* invoke-direct/range {v0 ..v5}, Lorg/codehaus/jackson/sym/Name3;-><init>(Ljava/lang/String;IIII)V */
/* .line 893 */
/* .restart local v6 # "buf":[I */
/* .restart local v7 # "i":I */
} // :cond_1
/* new-instance v0, Lorg/codehaus/jackson/sym/NameN; */
/* invoke-direct {v0, p1, p0, v6, p3}, Lorg/codehaus/jackson/sym/NameN;-><init>(Ljava/lang/String;I[II)V */
/* .line 878 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public static org.codehaus.jackson.sym.BytesToNameCanonicalizer createRoot ( ) {
/* .locals 3 */
/* .prologue */
/* .line 167 */
/* new-instance v0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer; */
/* const/16 v1, 0x40 */
int v2 = 1; // const/4 v2, 0x1
/* invoke-direct {v0, v1, v2}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;-><init>(IZ)V */
} // .end method
private void expandCollision ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 852 */
v1 = this._collList;
/* .line 853 */
/* .local v1, "old":[Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket; */
/* array-length v0, v1 */
/* .line 854 */
/* .local v0, "len":I */
/* add-int v2, v0, v0 */
/* new-array v2, v2, [Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket; */
this._collList = v2;
/* .line 855 */
v2 = this._collList;
java.lang.System .arraycopy ( v1,v3,v2,v3,v0 );
/* .line 856 */
return;
} // .end method
private Integer findBestBucket ( ) {
/* .locals 7 */
/* .prologue */
/* .line 795 */
v2 = this._collList;
/* .line 796 */
/* .local v2, "buckets":[Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket; */
/* const v0, 0x7fffffff */
/* .line 797 */
/* .local v0, "bestCount":I */
int v1 = -1; // const/4 v1, -0x1
/* .line 799 */
/* .local v1, "bestIx":I */
int v4 = 0; // const/4 v4, 0x0
/* .local v4, "i":I */
/* iget v5, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collEnd:I */
/* .local v5, "len":I */
} // :goto_0
/* if-ge v4, v5, :cond_2 */
/* .line 800 */
/* aget-object v6, v2, v4 */
v3 = (( org.codehaus.jackson.sym.BytesToNameCanonicalizer$Bucket ) v6 ).length ( ); // invoke-virtual {v6}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket;->length()I
/* .line 801 */
/* .local v3, "count":I */
/* if-ge v3, v0, :cond_1 */
/* .line 802 */
int v6 = 1; // const/4 v6, 0x1
/* if-ne v3, v6, :cond_0 */
/* .line 809 */
} // .end local v3 # "count":I
} // .end local v4 # "i":I
} // :goto_1
/* .line 805 */
/* .restart local v3 # "count":I */
/* .restart local v4 # "i":I */
} // :cond_0
/* move v0, v3 */
/* .line 806 */
/* move v1, v4 */
/* .line 799 */
} // :cond_1
/* add-int/lit8 v4, v4, 0x1 */
} // .end local v3 # "count":I
} // :cond_2
/* move v4, v1 */
/* .line 809 */
} // .end method
public static org.codehaus.jackson.sym.Name getEmptyName ( ) {
/* .locals 1 */
/* .prologue */
/* .line 323 */
org.codehaus.jackson.sym.Name1 .getEmptyName ( );
} // .end method
private void initTables ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "hashSize" # I */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 248 */
/* iput v1, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_count:I */
/* .line 249 */
/* new-array v0, p1, [I */
this._mainHash = v0;
/* .line 250 */
/* new-array v0, p1, [Lorg/codehaus/jackson/sym/Name; */
this._mainNames = v0;
/* .line 251 */
/* iput-boolean v1, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainHashShared:Z */
/* .line 252 */
/* iput-boolean v1, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainNamesShared:Z */
/* .line 253 */
/* add-int/lit8 v0, p1, -0x1 */
/* iput v0, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainHashMask:I */
/* .line 255 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collListShared:Z */
/* .line 256 */
int v0 = 0; // const/4 v0, 0x0
this._collList = v0;
/* .line 257 */
/* iput v1, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collEnd:I */
/* .line 259 */
/* iput-boolean v1, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_needRehash:Z */
/* .line 260 */
return;
} // .end method
private void markAsShared ( ) {
/* .locals 1 */
/* .prologue */
int v0 = 1; // const/4 v0, 0x1
/* .line 298 */
/* iput-boolean v0, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainHashShared:Z */
/* .line 299 */
/* iput-boolean v0, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainNamesShared:Z */
/* .line 300 */
/* iput-boolean v0, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collListShared:Z */
/* .line 301 */
return;
} // .end method
private synchronized void mergeChild ( org.codehaus.jackson.sym.BytesToNameCanonicalizer p0 ) {
/* .locals 3 */
/* .param p1, "child" # Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer; */
/* .prologue */
/* .line 265 */
/* monitor-enter p0 */
try { // :try_start_0
/* iget v0, p1, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_count:I */
/* .line 266 */
/* .local v0, "childCount":I */
/* iget v1, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_count:I */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-gt v0, v1, :cond_0 */
/* .line 294 */
} // :goto_0
/* monitor-exit p0 */
return;
/* .line 276 */
} // :cond_0
try { // :try_start_1
v1 = (( org.codehaus.jackson.sym.BytesToNameCanonicalizer ) p1 ).size ( ); // invoke-virtual {p1}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->size()I
/* const/16 v2, 0x1770 */
/* if-le v1, v2, :cond_1 */
/* .line 282 */
/* const/16 v1, 0x40 */
/* invoke-direct {p0, v1}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->initTables(I)V */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 265 */
} // .end local v0 # "childCount":I
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit p0 */
/* throw v1 */
/* .line 284 */
/* .restart local v0 # "childCount":I */
} // :cond_1
try { // :try_start_2
/* iget v1, p1, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_count:I */
/* iput v1, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_count:I */
/* .line 285 */
v1 = this._mainHash;
this._mainHash = v1;
/* .line 286 */
v1 = this._mainNames;
this._mainNames = v1;
/* .line 287 */
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainHashShared:Z */
/* .line 288 */
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainNamesShared:Z */
/* .line 289 */
/* iget v1, p1, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainHashMask:I */
/* iput v1, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainHashMask:I */
/* .line 290 */
v1 = this._collList;
this._collList = v1;
/* .line 291 */
/* iget v1, p1, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collCount:I */
/* iput v1, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collCount:I */
/* .line 292 */
/* iget v1, p1, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collEnd:I */
/* iput v1, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collEnd:I */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
private void nukeSymbols ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
int v1 = 0; // const/4 v1, 0x0
/* .line 780 */
/* iput v1, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_count:I */
/* .line 781 */
v0 = this._mainHash;
java.util.Arrays .fill ( v0,v1 );
/* .line 782 */
v0 = this._mainNames;
java.util.Arrays .fill ( v0,v2 );
/* .line 783 */
v0 = this._collList;
java.util.Arrays .fill ( v0,v2 );
/* .line 784 */
/* iput v1, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collCount:I */
/* .line 785 */
/* iput v1, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collEnd:I */
/* .line 786 */
return;
} // .end method
private void rehash ( ) {
/* .locals 19 */
/* .prologue */
/* .line 683 */
/* const/16 v16, 0x0 */
/* move/from16 v0, v16 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_needRehash:Z */
/* .line 685 */
/* const/16 v16, 0x0 */
/* move/from16 v0, v16 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainNamesShared:Z */
/* .line 691 */
/* move-object/from16 v0, p0 */
v11 = this._mainHash;
/* .line 692 */
/* .local v11, "oldMainHash":[I */
/* array-length v7, v11 */
/* .line 693 */
/* .local v7, "len":I */
/* add-int v8, v7, v7 */
/* .line 698 */
/* .local v8, "newLen":I */
/* const/high16 v16, 0x10000 */
/* move/from16 v0, v16 */
/* if-le v8, v0, :cond_1 */
/* .line 699 */
/* invoke-direct/range {p0 ..p0}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->nukeSymbols()V */
/* .line 772 */
} // :cond_0
return;
/* .line 703 */
} // :cond_1
/* new-array v0, v8, [I */
/* move-object/from16 v16, v0 */
/* move-object/from16 v0, v16 */
/* move-object/from16 v1, p0 */
this._mainHash = v0;
/* .line 704 */
/* add-int/lit8 v16, v8, -0x1 */
/* move/from16 v0, v16 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainHashMask:I */
/* .line 705 */
/* move-object/from16 v0, p0 */
v12 = this._mainNames;
/* .line 706 */
/* .local v12, "oldNames":[Lorg/codehaus/jackson/sym/Name; */
/* new-array v0, v8, [Lorg/codehaus/jackson/sym/Name; */
/* move-object/from16 v16, v0 */
/* move-object/from16 v0, v16 */
/* move-object/from16 v1, p0 */
this._mainNames = v0;
/* .line 707 */
int v14 = 0; // const/4 v14, 0x0
/* .line 708 */
/* .local v14, "symbolsSeen":I */
int v5 = 0; // const/4 v5, 0x0
/* .local v5, "i":I */
} // :goto_0
/* if-ge v5, v7, :cond_3 */
/* .line 709 */
/* aget-object v13, v12, v5 */
/* .line 710 */
/* .local v13, "symbol":Lorg/codehaus/jackson/sym/Name; */
if ( v13 != null) { // if-eqz v13, :cond_2
/* .line 711 */
/* add-int/lit8 v14, v14, 0x1 */
/* .line 712 */
v4 = (( org.codehaus.jackson.sym.Name ) v13 ).hashCode ( ); // invoke-virtual {v13}, Lorg/codehaus/jackson/sym/Name;->hashCode()I
/* .line 713 */
/* .local v4, "hash":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainHashMask:I */
/* move/from16 v16, v0 */
/* and-int v6, v4, v16 */
/* .line 714 */
/* .local v6, "ix":I */
/* move-object/from16 v0, p0 */
v0 = this._mainNames;
/* move-object/from16 v16, v0 */
/* aput-object v13, v16, v6 */
/* .line 715 */
/* move-object/from16 v0, p0 */
v0 = this._mainHash;
/* move-object/from16 v16, v0 */
/* shl-int/lit8 v17, v4, 0x8 */
/* aput v17, v16, v6 */
/* .line 708 */
} // .end local v4 # "hash":I
} // .end local v6 # "ix":I
} // :cond_2
/* add-int/lit8 v5, v5, 0x1 */
/* .line 723 */
} // .end local v13 # "symbol":Lorg/codehaus/jackson/sym/Name;
} // :cond_3
/* move-object/from16 v0, p0 */
/* iget v10, v0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collEnd:I */
/* .line 724 */
/* .local v10, "oldEnd":I */
if ( v10 != null) { // if-eqz v10, :cond_0
/* .line 728 */
/* const/16 v16, 0x0 */
/* move/from16 v0, v16 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collCount:I */
/* .line 729 */
/* const/16 v16, 0x0 */
/* move/from16 v0, v16 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collEnd:I */
/* .line 730 */
/* const/16 v16, 0x0 */
/* move/from16 v0, v16 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collListShared:Z */
/* .line 732 */
/* move-object/from16 v0, p0 */
v9 = this._collList;
/* .line 733 */
/* .local v9, "oldBuckets":[Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket; */
/* array-length v0, v9 */
/* move/from16 v16, v0 */
/* move/from16 v0, v16 */
/* new-array v0, v0, [Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket; */
/* move-object/from16 v16, v0 */
/* move-object/from16 v0, v16 */
/* move-object/from16 v1, p0 */
this._collList = v0;
/* .line 734 */
int v5 = 0; // const/4 v5, 0x0
} // :goto_1
/* if-ge v5, v10, :cond_9 */
/* .line 735 */
/* aget-object v3, v9, v5 */
/* .local v3, "curr":Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket; */
} // :goto_2
if ( v3 != null) { // if-eqz v3, :cond_8
/* .line 736 */
/* add-int/lit8 v14, v14, 0x1 */
/* .line 737 */
v13 = this.mName;
/* .line 738 */
/* .restart local v13 # "symbol":Lorg/codehaus/jackson/sym/Name; */
v4 = (( org.codehaus.jackson.sym.Name ) v13 ).hashCode ( ); // invoke-virtual {v13}, Lorg/codehaus/jackson/sym/Name;->hashCode()I
/* .line 739 */
/* .restart local v4 # "hash":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainHashMask:I */
/* move/from16 v16, v0 */
/* and-int v6, v4, v16 */
/* .line 740 */
/* .restart local v6 # "ix":I */
/* move-object/from16 v0, p0 */
v0 = this._mainHash;
/* move-object/from16 v16, v0 */
/* aget v15, v16, v6 */
/* .line 741 */
/* .local v15, "val":I */
/* move-object/from16 v0, p0 */
v0 = this._mainNames;
/* move-object/from16 v16, v0 */
/* aget-object v16, v16, v6 */
/* if-nez v16, :cond_4 */
/* .line 742 */
/* move-object/from16 v0, p0 */
v0 = this._mainHash;
/* move-object/from16 v16, v0 */
/* shl-int/lit8 v17, v4, 0x8 */
/* aput v17, v16, v6 */
/* .line 743 */
/* move-object/from16 v0, p0 */
v0 = this._mainNames;
/* move-object/from16 v16, v0 */
/* aput-object v13, v16, v6 */
/* .line 735 */
} // :goto_3
v3 = this.mNext;
/* .line 745 */
} // :cond_4
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collCount:I */
/* move/from16 v16, v0 */
/* add-int/lit8 v16, v16, 0x1 */
/* move/from16 v0, v16 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collCount:I */
/* .line 746 */
/* and-int/lit16 v2, v15, 0xff */
/* .line 747 */
/* .local v2, "bucket":I */
/* if-nez v2, :cond_7 */
/* .line 748 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collEnd:I */
/* move/from16 v16, v0 */
/* const/16 v17, 0xfe */
/* move/from16 v0, v16 */
/* move/from16 v1, v17 */
/* if-gt v0, v1, :cond_6 */
/* .line 749 */
/* move-object/from16 v0, p0 */
/* iget v2, v0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collEnd:I */
/* .line 750 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collEnd:I */
/* move/from16 v16, v0 */
/* add-int/lit8 v16, v16, 0x1 */
/* move/from16 v0, v16 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collEnd:I */
/* .line 752 */
/* move-object/from16 v0, p0 */
v0 = this._collList;
/* move-object/from16 v16, v0 */
/* move-object/from16 v0, v16 */
/* array-length v0, v0 */
/* move/from16 v16, v0 */
/* move/from16 v0, v16 */
/* if-lt v2, v0, :cond_5 */
/* .line 753 */
/* invoke-direct/range {p0 ..p0}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->expandCollision()V */
/* .line 759 */
} // :cond_5
} // :goto_4
/* move-object/from16 v0, p0 */
v0 = this._mainHash;
/* move-object/from16 v16, v0 */
/* and-int/lit16 v0, v15, -0x100 */
/* move/from16 v17, v0 */
/* add-int/lit8 v18, v2, 0x1 */
/* or-int v17, v17, v18 */
/* aput v17, v16, v6 */
/* .line 764 */
} // :goto_5
/* move-object/from16 v0, p0 */
v0 = this._collList;
/* move-object/from16 v16, v0 */
/* new-instance v17, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket; */
/* move-object/from16 v0, p0 */
v0 = this._collList;
/* move-object/from16 v18, v0 */
/* aget-object v18, v18, v2 */
/* move-object/from16 v0, v17 */
/* move-object/from16 v1, v18 */
/* invoke-direct {v0, v13, v1}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket;-><init>(Lorg/codehaus/jackson/sym/Name;Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket;)V */
/* aput-object v17, v16, v2 */
/* .line 756 */
} // :cond_6
v2 = /* invoke-direct/range {p0 ..p0}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->findBestBucket()I */
/* .line 761 */
} // :cond_7
/* add-int/lit8 v2, v2, -0x1 */
/* .line 734 */
} // .end local v2 # "bucket":I
} // .end local v4 # "hash":I
} // .end local v6 # "ix":I
} // .end local v13 # "symbol":Lorg/codehaus/jackson/sym/Name;
} // .end local v15 # "val":I
} // :cond_8
/* add-int/lit8 v5, v5, 0x1 */
/* goto/16 :goto_1 */
/* .line 769 */
} // .end local v3 # "curr":Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket;
} // :cond_9
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_count:I */
/* move/from16 v16, v0 */
/* move/from16 v0, v16 */
/* if-eq v14, v0, :cond_0 */
/* .line 770 */
/* new-instance v16, Ljava/lang/RuntimeException; */
/* new-instance v17, Ljava/lang/StringBuilder; */
/* invoke-direct/range {v17 ..v17}, Ljava/lang/StringBuilder;-><init>()V */
final String v18 = "Internal error: count after rehash "; // const-string v18, "Internal error: count after rehash "
/* invoke-virtual/range {v17 ..v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, v17 */
(( java.lang.StringBuilder ) v0 ).append ( v14 ); // invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v18 = "; should be "; // const-string v18, "; should be "
/* invoke-virtual/range {v17 ..v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_count:I */
/* move/from16 v18, v0 */
/* invoke-virtual/range {v17 ..v18}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v17 ..v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-direct/range {v16 ..v17}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v16 */
} // .end method
private void unshareCollision ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 830 */
v1 = this._collList;
/* .line 831 */
/* .local v1, "old":[Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket; */
/* if-nez v1, :cond_0 */
/* .line 832 */
/* const/16 v2, 0x20 */
/* new-array v2, v2, [Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket; */
this._collList = v2;
/* .line 838 */
} // :goto_0
/* iput-boolean v3, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_collListShared:Z */
/* .line 839 */
return;
/* .line 834 */
} // :cond_0
/* array-length v0, v1 */
/* .line 835 */
/* .local v0, "len":I */
/* new-array v2, v0, [Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket; */
this._collList = v2;
/* .line 836 */
v2 = this._collList;
java.lang.System .arraycopy ( v1,v3,v2,v3,v0 );
} // .end method
private void unshareMain ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 820 */
v1 = this._mainHash;
/* .line 821 */
/* .local v1, "old":[I */
v2 = this._mainHash;
/* array-length v0, v2 */
/* .line 823 */
/* .local v0, "len":I */
/* new-array v2, v0, [I */
this._mainHash = v2;
/* .line 824 */
v2 = this._mainHash;
java.lang.System .arraycopy ( v1,v3,v2,v3,v0 );
/* .line 825 */
/* iput-boolean v3, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainHashShared:Z */
/* .line 826 */
return;
} // .end method
private void unshareNames ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 843 */
v1 = this._mainNames;
/* .line 844 */
/* .local v1, "old":[Lorg/codehaus/jackson/sym/Name; */
/* array-length v0, v1 */
/* .line 845 */
/* .local v0, "len":I */
/* new-array v2, v0, [Lorg/codehaus/jackson/sym/Name; */
this._mainNames = v2;
/* .line 846 */
v2 = this._mainNames;
java.lang.System .arraycopy ( v1,v3,v2,v3,v0 );
/* .line 847 */
/* iput-boolean v3, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainNamesShared:Z */
/* .line 848 */
return;
} // .end method
/* # virtual methods */
public org.codehaus.jackson.sym.Name addName ( java.lang.String p0, Integer[] p1, Integer p2 ) {
/* .locals 3 */
/* .param p1, "symbolStr" # Ljava/lang/String; */
/* .param p2, "quads" # [I */
/* .param p3, "qlen" # I */
/* .prologue */
/* .line 482 */
/* iget-boolean v2, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_intern:Z */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 483 */
v2 = org.codehaus.jackson.util.InternCache.instance;
(( org.codehaus.jackson.util.InternCache ) v2 ).intern ( p1 ); // invoke-virtual {v2, p1}, Lorg/codehaus/jackson/util/InternCache;->intern(Ljava/lang/String;)Ljava/lang/String;
/* .line 485 */
} // :cond_0
v0 = org.codehaus.jackson.sym.BytesToNameCanonicalizer .calcHash ( p2,p3 );
/* .line 486 */
/* .local v0, "hash":I */
org.codehaus.jackson.sym.BytesToNameCanonicalizer .constructName ( v0,p1,p2,p3 );
/* .line 487 */
/* .local v1, "symbol":Lorg/codehaus/jackson/sym/Name; */
/* invoke-direct {p0, v0, v1}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_addSymbol(ILorg/codehaus/jackson/sym/Name;)V */
/* .line 488 */
} // .end method
public org.codehaus.jackson.sym.Name findName ( Integer p0 ) {
/* .locals 7 */
/* .param p1, "firstQuad" # I */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
/* .line 343 */
v1 = org.codehaus.jackson.sym.BytesToNameCanonicalizer .calcHash ( p1 );
/* .line 344 */
/* .local v1, "hash":I */
/* iget v6, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainHashMask:I */
/* and-int v2, v1, v6 */
/* .line 345 */
/* .local v2, "ix":I */
v6 = this._mainHash;
/* aget v4, v6, v2 */
/* .line 350 */
/* .local v4, "val":I */
/* shr-int/lit8 v6, v4, 0x8 */
/* xor-int/2addr v6, v1 */
/* shl-int/lit8 v6, v6, 0x8 */
/* if-nez v6, :cond_3 */
/* .line 352 */
v6 = this._mainNames;
/* aget-object v3, v6, v2 */
/* .line 353 */
/* .local v3, "name":Lorg/codehaus/jackson/sym/Name; */
/* if-nez v3, :cond_1 */
/* move-object v3, v5 */
/* .line 372 */
} // .end local v3 # "name":Lorg/codehaus/jackson/sym/Name;
} // :cond_0
} // :goto_0
/* .line 356 */
/* .restart local v3 # "name":Lorg/codehaus/jackson/sym/Name; */
} // :cond_1
v6 = (( org.codehaus.jackson.sym.Name ) v3 ).equals ( p1 ); // invoke-virtual {v3, p1}, Lorg/codehaus/jackson/sym/Name;->equals(I)Z
/* if-nez v6, :cond_0 */
/* .line 363 */
} // .end local v3 # "name":Lorg/codehaus/jackson/sym/Name;
} // :cond_2
/* and-int/lit16 v4, v4, 0xff */
/* .line 364 */
/* if-lez v4, :cond_4 */
/* .line 365 */
/* add-int/lit8 v4, v4, -0x1 */
/* .line 366 */
v6 = this._collList;
/* aget-object v0, v6, v4 */
/* .line 367 */
/* .local v0, "bucket":Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket; */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 368 */
int v5 = 0; // const/4 v5, 0x0
(( org.codehaus.jackson.sym.BytesToNameCanonicalizer$Bucket ) v0 ).find ( v1, p1, v5 ); // invoke-virtual {v0, v1, p1, v5}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket;->find(III)Lorg/codehaus/jackson/sym/Name;
/* .line 359 */
} // .end local v0 # "bucket":Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket;
} // :cond_3
/* if-nez v4, :cond_2 */
/* move-object v3, v5 */
/* .line 360 */
} // :cond_4
/* move-object v3, v5 */
/* .line 372 */
} // .end method
public org.codehaus.jackson.sym.Name findName ( Integer p0, Integer p1 ) {
/* .locals 7 */
/* .param p1, "firstQuad" # I */
/* .param p2, "secondQuad" # I */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
/* .line 393 */
v1 = org.codehaus.jackson.sym.BytesToNameCanonicalizer .calcHash ( p1,p2 );
/* .line 394 */
/* .local v1, "hash":I */
/* iget v6, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainHashMask:I */
/* and-int v2, v1, v6 */
/* .line 395 */
/* .local v2, "ix":I */
v6 = this._mainHash;
/* aget v4, v6, v2 */
/* .line 400 */
/* .local v4, "val":I */
/* shr-int/lit8 v6, v4, 0x8 */
/* xor-int/2addr v6, v1 */
/* shl-int/lit8 v6, v6, 0x8 */
/* if-nez v6, :cond_3 */
/* .line 402 */
v6 = this._mainNames;
/* aget-object v3, v6, v2 */
/* .line 403 */
/* .local v3, "name":Lorg/codehaus/jackson/sym/Name; */
/* if-nez v3, :cond_1 */
/* move-object v3, v5 */
/* .line 422 */
} // .end local v3 # "name":Lorg/codehaus/jackson/sym/Name;
} // :cond_0
} // :goto_0
/* .line 406 */
/* .restart local v3 # "name":Lorg/codehaus/jackson/sym/Name; */
} // :cond_1
v6 = (( org.codehaus.jackson.sym.Name ) v3 ).equals ( p1, p2 ); // invoke-virtual {v3, p1, p2}, Lorg/codehaus/jackson/sym/Name;->equals(II)Z
/* if-nez v6, :cond_0 */
/* .line 413 */
} // .end local v3 # "name":Lorg/codehaus/jackson/sym/Name;
} // :cond_2
/* and-int/lit16 v4, v4, 0xff */
/* .line 414 */
/* if-lez v4, :cond_4 */
/* .line 415 */
/* add-int/lit8 v4, v4, -0x1 */
/* .line 416 */
v6 = this._collList;
/* aget-object v0, v6, v4 */
/* .line 417 */
/* .local v0, "bucket":Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket; */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 418 */
(( org.codehaus.jackson.sym.BytesToNameCanonicalizer$Bucket ) v0 ).find ( v1, p1, p2 ); // invoke-virtual {v0, v1, p1, p2}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket;->find(III)Lorg/codehaus/jackson/sym/Name;
/* .line 409 */
} // .end local v0 # "bucket":Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket;
} // :cond_3
/* if-nez v4, :cond_2 */
/* move-object v3, v5 */
/* .line 410 */
} // :cond_4
/* move-object v3, v5 */
/* .line 422 */
} // .end method
public org.codehaus.jackson.sym.Name findName ( Integer[] p0, Integer p1 ) {
/* .locals 7 */
/* .param p1, "quads" # [I */
/* .param p2, "qlen" # I */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
/* .line 450 */
v1 = org.codehaus.jackson.sym.BytesToNameCanonicalizer .calcHash ( p1,p2 );
/* .line 452 */
/* .local v1, "hash":I */
/* iget v6, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainHashMask:I */
/* and-int v2, v1, v6 */
/* .line 453 */
/* .local v2, "ix":I */
v6 = this._mainHash;
/* aget v4, v6, v2 */
/* .line 454 */
/* .local v4, "val":I */
/* shr-int/lit8 v6, v4, 0x8 */
/* xor-int/2addr v6, v1 */
/* shl-int/lit8 v6, v6, 0x8 */
/* if-nez v6, :cond_1 */
/* .line 455 */
v6 = this._mainNames;
/* aget-object v3, v6, v2 */
/* .line 456 */
/* .local v3, "name":Lorg/codehaus/jackson/sym/Name; */
if ( v3 != null) { // if-eqz v3, :cond_0
v6 = (( org.codehaus.jackson.sym.Name ) v3 ).equals ( p1, p2 ); // invoke-virtual {v3, p1, p2}, Lorg/codehaus/jackson/sym/Name;->equals([II)Z
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 471 */
} // .end local v3 # "name":Lorg/codehaus/jackson/sym/Name;
} // :cond_0
} // :goto_0
/* .line 460 */
} // :cond_1
/* if-nez v4, :cond_2 */
/* move-object v3, v5 */
/* .line 461 */
/* .line 463 */
} // :cond_2
/* and-int/lit16 v4, v4, 0xff */
/* .line 464 */
/* if-lez v4, :cond_3 */
/* .line 465 */
/* add-int/lit8 v4, v4, -0x1 */
/* .line 466 */
v6 = this._collList;
/* aget-object v0, v6, v4 */
/* .line 467 */
/* .local v0, "bucket":Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket; */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 468 */
(( org.codehaus.jackson.sym.BytesToNameCanonicalizer$Bucket ) v0 ).find ( v1, p1, p2 ); // invoke-virtual {v0, v1, p1, p2}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket;->find(I[II)Lorg/codehaus/jackson/sym/Name;
} // .end local v0 # "bucket":Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer$Bucket;
} // :cond_3
/* move-object v3, v5 */
/* .line 471 */
} // .end method
public synchronized org.codehaus.jackson.sym.BytesToNameCanonicalizer makeChild ( Boolean p0, Boolean p1 ) {
/* .locals 1 */
/* .param p1, "canonicalize" # Z */
/* .param p2, "intern" # Z */
/* .prologue */
/* .line 177 */
/* monitor-enter p0 */
try { // :try_start_0
/* new-instance v0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer; */
/* invoke-direct {v0, p0, p2}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;-><init>(Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;Z)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public Boolean maybeDirty ( ) {
/* .locals 1 */
/* .prologue */
/* .line 318 */
/* iget-boolean v0, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_mainHashShared:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void release ( ) {
/* .locals 1 */
/* .prologue */
/* .line 189 */
v0 = (( org.codehaus.jackson.sym.BytesToNameCanonicalizer ) p0 ).maybeDirty ( ); // invoke-virtual {p0}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->maybeDirty()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this._parent;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 190 */
v0 = this._parent;
/* invoke-direct {v0, p0}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->mergeChild(Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;)V */
/* .line 195 */
/* invoke-direct {p0}, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->markAsShared()V */
/* .line 197 */
} // :cond_0
return;
} // .end method
public Integer size ( ) {
/* .locals 1 */
/* .prologue */
/* .line 309 */
/* iget v0, p0, Lorg/codehaus/jackson/sym/BytesToNameCanonicalizer;->_count:I */
} // .end method
