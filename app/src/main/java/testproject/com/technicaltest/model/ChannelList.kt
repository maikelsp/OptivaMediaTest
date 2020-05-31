package testproject.com.technicaltest.model

public class ChannelList {
    private var metadata:Metadata = Metadata()
    private var response:List<Channel> = ArrayList<Channel>()

    constructor(metadata: Metadata, response: List<Channel>) {
        this.metadata = metadata
        this.response = response
    }


    public fun getMetadata() :Metadata {
        return this.metadata
    }

    public fun getResponse() :List<Channel> {
        return this.response
    }
}