package testproject.com.technicaltest.model

class Metadata {
    private var request:String = ""
    private var fullLength:Int = 0
    private var timestamp:Long = 0

    public fun getRequest() :String {
        return this.request
    }

    public fun getFullLength() :Int {
        return this.fullLength
    }

    public fun getTimeStamp() :Long {
        return this.timestamp
    }
}