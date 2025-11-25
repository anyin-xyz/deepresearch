package com.alibaba.cloud.ai.example.deepresearch.node;

import com.alibaba.cloud.ai.graph.OverAllState;
import com.alibaba.cloud.ai.graph.action.NodeAction;
import org.springframework.ai.chat.client.ChatClient;

import java.util.Map;

/**
 * Short-term user role memory node
 *
 * @author benym
 */
public class ShortUserRoleMemoryNode implements NodeAction {

    private final ChatClient shortMemoryAgent;

    public ShortUserRoleMemoryNode(ChatClient shortMemoryAgent) {
        this.shortMemoryAgent = shortMemoryAgent;
    }

    @Override
    public Map<String, Object> apply(OverAllState state) throws Exception {
        return Map.of();
    }
}
